package calculator.domain;

public class Calculator {

    private Input input;
    private Separator separator;

    public void start() {
        //추후에 이 기능은 다른 객체에서 실행 해야할까?
        System.out.println("덧셈할 문자열을 입력해주세요.");

        input = new Input();
        input.readFirstInput();

        separator = new Separator();
        try {
            if (input.isDefaultInput()) {
                // 기본 구분자 기능 실행

                // DTO를 통해 구분자 검증 호출
                separator.validateSeparators(input.getFirstInput()); // 구분자 검증 메소드 호출
            } else {
                // 커스텀 구분자 기능 실행
                System.out.println("커스텀 구분자 기능 실행");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


}
