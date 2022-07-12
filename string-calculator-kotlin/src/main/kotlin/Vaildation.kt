class Vaildation(private val expressionParam: String?) {

    companion object {
        val REGEX: Regex = "^\\d+( ?[+\\-*/] ?\\d+)*\$".toRegex()

        fun from(expressionParam: String?): Vaildation {
            validate(expressionParam)
            return Vaildation(expressionParam);
        }

        private fun validate(expressionParam: String?) {
            expressionParam?: throw IllegalArgumentException("null입니다.")
            if(!expressionParam.matches(REGEX)) throw IllegalArgumentException("유효성 검증 실패")
        }
    }

    fun get(): String? = this.expressionParam
}