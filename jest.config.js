export default {
    preset: 'ts-jest',
    roots: ["src/test/typescript"],
    testEnvironment: 'node',
    transform: {
        '^.+\\.ts?$': 'ts-jest',
    },
    transformIgnorePatterns: ['node_modules/']
}