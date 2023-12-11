class Vaildator private constructor(private val expressionParam: String) {

    companion object {
        private val REGEX: Regex = "^\\d+( ?[+\\-*/] ?\\d+)*\$".toRegex()

        fun from(expressionParam: String?): Vaildator {
            val expression = expressionParam ?: error("null")
            validate(expression)
            return Vaildator(expression);
        }

        private fun validate(expression: String) {
            if(!expression.matches(REGEX)) throw IllegalArgumentException("유효성 검증 실패")
        }
    }
    fun get(): String = this.expressionParam.replace(" ", "")

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Vaildator) return false

        if (expressionParam != other.expressionParam) return false

        return true
    }

    override fun hashCode(): Int {
        return expressionParam?.hashCode() ?: 0
    }

}