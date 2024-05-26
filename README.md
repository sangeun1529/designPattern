# designPattern
디자인 패턴 코틀린 예시

# List
- 생성
  - 팩토리 패턴
  - 싱글턴 패턴
- 구조
  - 데코레이터 패턴
    - 데코레이터는 객체들을 새로운 행동들을 포함한 특수 래퍼 객체들 내에 넣어서 위 행동들을 해당 객체들에 연결시키는 구조적 디자인 패턴
    - https://refactoring.guru/ko/design-patterns/decorator
  - 파사드 패턴
    - https://refactoring.guru/ko/design-patterns/facade
    - 퍼사드 패턴은 라이브러리에 대한, 프레임워크에 대한 또는 다른 클래스들의 복잡한 집합에 대한 단순화된 인터페이스를 제공하는 구조적 디자인 패턴
  - 어뎁터 패턴
    - 어댑터는 호환되지 않는 인터페이스를 가진 객체들이 협업할 수 있도록 하는 구조적 디자인패턴
    - https://refactoring.guru/ko/design-patterns/adapter
- 행동
  - 커멘드 패턴
    - 커맨드는 요청을 요청에 대한 모든 정보가 포함된 독립실행형 객체로 변환하는 행동 디자인 패턴
    - 이 변환은 다양한 요청들이 있는 메서드들을 인수화 할 수 있도록 하며, 요청의 실행을 지연 또는 대기열에 넣을 수 있도록 하고, 또 실행 취소할 수 있는 작업을 지원할 수 있도록 합니다.
    - https://refactoring.guru/ko/design-patterns/command
  - 전략 패턴
- 추가예정

# 참조
https://github.com/gliderwiki/designPattern/blob/master/src/main/java/net/harunote/pattern/adapter/AudioPlayer.java
- Kotlin 변환
https://refactoring.guru/ko/design-patterns
- 각각의 패턴 정리 사이트
