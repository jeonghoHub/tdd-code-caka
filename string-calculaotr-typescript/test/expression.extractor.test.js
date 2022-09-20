import ExpressionExtractor from "../src/expression.extractor";

describe('연산자, 피연산자 추출기', () => {
    it.each`
        expression          
        ${'5 + 5 * 5 -+ 5'}
        ${'10+ 3- 3*10+'}
        ${'+30- 3- 3*10'}
    `('비정상적인 값은 예외를 뱉는다.', async ({expression}) => {
        await expect(async () => {
            await new ExpressionExtractor(expression);
        }).rejects.toThrowError(new Error('유효하지 못한 값 입니다'))
    })
    it.each`
        expression
        ${'5 + 5 + 5'}
        ${'5 * 5 - 5 - 2'}
        ${'5 + 5 + 5 / 3 - 3023 + 3-2'}
    `('정상적인 값은 객체를 생성한다.',({expression}) => {
        //when
        const result = new ExpressionExtractor(expression);
        expect(result).toEqual({
            expression: expression
        })
    })
})

