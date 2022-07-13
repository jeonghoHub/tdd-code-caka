class Vaildation private constructor(private val expressionParam: String?) {

    companion object {
        private val REGEX: Regex = "^\\d+( ?[+\\-*/] ?\\d+)*\$".toRegex()

        fun from(expressionParam: String?): Vaildation {
            validate(expressionParam)
            return Vaildation(expressionParam);
        }

        private fun validate(expressionParam: String?) {
            expressionParam?: throw IllegalArgumentException("null입니다.")
            if(!expressionParam.matches(REGEX)) throw IllegalArgumentException("유효성 검증 실패")
        }
    }
    fun get(): String? = this.expressionParam?.replace(" ", "")

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Vaildation) return false

        if (expressionParam != other.expressionParam) return false

        return true
    }

    override fun hashCode(): Int {
        return expressionParam?.hashCode() ?: 0
    }

}