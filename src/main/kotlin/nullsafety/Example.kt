package nullsafety

fun main(args: Array<String>) {

    // 널이 될 수 있는 타입 정의
    var nullableString: String? = null
    println("nullableString : $nullableString")


    // Safe Call 연산
    nullableString = "minsoo"
    var length: Int? = nullableString?.length
    println("length : $length")

    // 널 복합 연산자 (엘비스 연산자)
    nullableString = null
    val nonNullString: String = nullableString ?: "default"
    println("nonNullString : $nonNullString")

    getInt()?.let {
        println("it : $it")
    }

    // 널 체크와 타입 캐스팅
    if(nullableString is String) { // is 연산자를 사용하여 타입 체크와 널 체크를 동시에 할 수 있다
        println("nullableString is String")
    }

    // 널 검사 없이 접근 (Assertive Cast)
    getInt()!! // NPE 발생할 수 있음
}
// 레트런 타입
fun getInt(): Int? {
    return null
}