package calculator.domain;

import calculator.view.InputView;
import calculator.view.OutputView;

public class Calculator {

    private final Input input;
    private final Separator separator;
    private final InputView inputView;
    private final OutputView outputView;

    private Numbers number;

    public Calculator(Input input, Separator separator, InputView inputView,
        OutputView outputView) {
        this.input = input;
        this.separator = separator;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        startProcess();

        try { //!!추후에 else문 분리해야함!!
            if (input.isDefaultInput()) {
                // 기본 구분자 기능 실행

                separator.validateSeparators(input.getFirstInput()); // 구분자 검증 메소드 호출

                //계산 문자열을 구분자로 구분한다.
                String[] parts = separator.splitCalculationString(
                    input.getFirstInput());//String[] 반환

                //Number 객체 생성을 통한 구분 작업 및 검증
                number = new Numbers(parts);

                //결과 출력
                showResultProcess();
            } else {
                // 커스텀 구분자 기능 실행
                input.splitCustomSeparator();

                separator.validateCustomEmpty(input.getFirstInput()); // 커스텀 구분자가 비어있는지 확인
                separator.validateCustomSize(input.getFirstInput()); // 커스텀 구분자의 길이를 확인
                separator.validateNumberInCustom(input.getFirstInput()); // 커스텀 구분자 내에 숫자가 있는지 확인
                //separator.validateDuplicateCustom(input.getFirstInput()); // 커스텀 구분자가 중복되었는지 확인

                //예외처리 없이 정상흐름이면 커스텀 구분자를 리스트에 넣어준다.
                separator.addCustomSeparator(input.getFirstInput());

                //계산 문자열을 구분자로 구분한다.
                String[] parts = separator.splitCalculationString(
                    input.getSecondInput());//String[] 반환

                //Number 객체 생성을 통한 구분 작업 및 검증
                number = new Numbers(parts);

                //결과 출력
                showResultProcess();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void showResultProcess() {
        outputView.showResult(number.calculate());
    }

    private void startProcess() {
        inputView.showStartMessage();

        input.readFirstInput();
    }


}
