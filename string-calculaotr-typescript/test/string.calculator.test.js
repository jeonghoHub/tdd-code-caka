import stringCalculator from "../src/string.calculator";

describe('문자열 계산기 테스트', () => {
    it.each`
        expression         | exactly
        ${'10 + 5 - 3'}    | ${12}
        ${'10 + 30 * 2'}   | ${80}
        ${'3.2 + 3.2 - 2'} | ${4.2}
    `('계산 테스트',  ({expression, exactly}) => {
        const expected = stringCalculator.Calculate(expression);
        expect(exactly).toBe(expected)
    })
})

