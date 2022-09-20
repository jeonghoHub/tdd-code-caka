const REGEXP: RegExp = /^\d+( ?[+\-*/] ?\d+)*$/g;

export default class ExpressionExtractor {
    private expression: string;

    constructor(expression: string) {
        this.expression = this.validate(expression);
    }

    operatorExtract(): string {

        return "123";
    }
    operandExtract(): string {

        return "123";
    }

    private validate(expression: string): string {
        if(!REGEXP.test(expression)) {
            throw new Error('유효하지 못한 값 입니다')
        }
        return expression;
    }
}
