import ExpressionExtractor from "../src/expression.extractor";

describe('연산자, 피연산자 추출기', () => {
    it.each`
        expression          
        ${'5 + 5 * 5 -+ 5'}
        ${'10+ 3- 3*10+'}
        ${'+30- 3- 3*10'}
    `('유효성검증에 통과하지 못하는 값은 실패한다.', async ({expression}) => {
        await expect(async () => {
            await new ExpressionExtractor(expression);
        }).rejects.toThrowError(new Error('유효하지 못한 값 입니다'))
    })
})

