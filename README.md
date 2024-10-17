# 🚀 Java Calculator Precourse

입력한 문자열에서 숫자를 추출하여 더하는 계산기를 구현하자.

## ✨ 구현할 기능 목록

1. **프로그램 시작 안내 메시지 출력**
    - [x] "덧셈할 문자열을 입력해주세요." 메시지를 출력한다.


2. **기본 구분자를 구분자 리스트에 추가한다.**
    - [x] 쉼표(,)와 콜론(:)을 구분자 리스트에 추가한다.


3. **입력이 커스텀 구분자 기능을 포함하는지 확인한다.**
    - [x] 사용자의 입력이 "//"로 시작하는지 확인한다.


4. **입력에 대한 검증 수행**
    - 커스텀 구분자 지정을 안 한 경우 (기본 구분자 처리)
        - [x] 구분자들이 기본 구분자로만 구성되어 있는지 확인한다.
    - 커스텀 구분자 지정을 한 경우 (커스텀 구분자 처리)
        - [ ] 입력 양식이 "//"와 "\n" 사이에 구분자가 들어있는지 확인한다.


5. **구분자에 대한 검증 실행**
    - [ ] 구분자의 크기가 최대 길이(10) 범위인지 확인한다.
    - [ ] 구분자에 숫자가 포함되어 있는지 확인한다.
    - [ ] 커스텀 구분자가 기본 구분자와 일치한지 확인한다.
    - [ ] 커스텀 구분자가 중복되는지 확인한다.

5. **커스텀 구분자를 입력받았다면 구분자 리스트에 추가한다.**
    - [ ] 올바른 커스텀 구분자를 구분자 리스트에 추가한다.


6. **입력 문자열을 구분자로 구분하기**
    - [ ] 문자열을 구분자로 구분하여 숫자들을 추출한다.
    - [ ] 구분한 문자열이 빈 문자열이면 0을 반환한다.
    - [ ] 구분한 문자열들이 모두 숫자 형태인지 확인한다.
    - [ ] 구분한 문자열들(숫자들)이 모두 범위(0 이상이며 `Integer.MAX_VALUE` 이하) 이내인지 확인한다.


7. **구분한 숫자들에 대해 계산 진행 및 검증**
    - [ ] 진행 결과값이 범위 이내인지 확인한다.


8. **결과값을 출력하기**
    - [ ] "결과값 : (결과값)" 메시지를 출력한다.
