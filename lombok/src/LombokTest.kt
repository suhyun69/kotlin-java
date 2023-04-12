fun main() {

    /*
    val hero = Hero()
    hero.name = "아이언맨" // Cannot access 'name': it is private in 'Hero'
    hero.address = "스타크타워" // 정상 출력.
    println(hero.name)
     */
    // lombok 자체가 kotlin에서 정상적으로 작동 안 함

    // 방법 1.
    // -> lombok을 제거하면 됨
    val hero2 = HeroDelombok()
    hero2.name = "아이언맨"
    println(hero2.name)

    // 방법 2 (추천)
    // DTO -> Kotlin으로 마이그레이션
    // Kotlin의 데이터 클래스로 : HeroKt
    // data class 자체가 equals, hashcode, toString 같은 기능 제공
    val heroKt = HeroKt(name = "아이언맨", age = 50, address = "스타크타워")
    println(heroKt)



}