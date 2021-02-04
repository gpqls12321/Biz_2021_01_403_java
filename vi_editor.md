# vi editor
* vi : Visual Editor 라는 이름에서 유래
* vi editor는 linux 환경에 가장 많이 사용되는 Text 편집기(editor)
  윈도우의 메모장, 워드패드 등과 같이 Text 문서를 만드는 도구

## 기본 사용법
* 시작하기 : vi test.txt
 만약 현재 폴더(디렉토리) test.txt 파일이 있으면 open하고, 없으면 create(파일 생성 준비)

 * vi editor 초기화면에서는 화살표, enter등의 키가 전혀 작동하지 않는다.

 * vi editor 초기화면에서 영문 소문자 i 누른다

 ### vi 화면
 * 명령어 화면(상태) : 처음 시작한 화면 
 * 편집 화면(상태) : 처음 시작화면에서 i 키를 눌렀을 때, text 문서를 작성할 수 있는 상태
 * 편집 화면(어디서나) 에서 ESC 키 ==> 명령어 상태
 * 명령상태 : 종료, 저장, 저장 후 종료, 저장하지 않고 종료 등을 수행할 수 있는 상태 
 * 명령어 상태일 때 :wq 를 입력한 후 엔터를 누르면 저장되고 종료된다.
 * 명령어 상태일 때 :q 만 입력하면 그냥 종료
 * 내용이 변경(추가, 수정, 삭제)된 때는 :q 로 종료할 수 없다
 * 변경한 내용을 무시하고 (저장하지 않고) 그냥 종료하고 싶을 때는 :q! 를 입력한다 

 * 영문소문자 i : 명령상태 -> 편집상태
 * ESC : 편집상태 -> 명령상태
 * 저장, 종료, 저장후종료, 저장없이 종료 등은 반드시 명령상태에서 실행한다.

 ### 명령상태
 * :q = 그냥 종료 (단, 내용 변경이 없을 때)
 * :q! = 그냥 종료 (변경된 내용 무시)
 * :w = 저장하기
 * :wq = 저장 후 종료
 * dd = 한줄 잘라내기
 * p = 잘라낸 줄 붙이기
 