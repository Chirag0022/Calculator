const display = document.getElementById('display');
const buttons = document.querySelectorAll('button');

let currentNumber = '';
let previousNumber = '';
let operator = '';

buttons.forEach(button => {
    button.addEventListener('click', () => {
        const id = button.id;

        if (id === 'clear') {
            currentNumber = '';
            previousNumber = '';
            operator = '';
            display.value = '';
        } else if (id === 'backspace') {
            currentNumber = currentNumber.slice(0, -1);
            display.value = currentNumber;
        } else if (id === 'equals') {
            calculate();
        } else if (id === 'add' || id === 'subtract' || id === 'multiply' || id === 'divide') {
            operator = id;
            previousNumber = currentNumber;
            currentNumber = '';
        } else if (id === 'sqrt') {
            currentNumber = Math.sqrt(currentNumber);
            display.value = currentNumber;
        } else if (id === 'pow') {
            currentNumber = Math.pow(currentNumber, 2);
            display.value = currentNumber;
        } else if (id === 'sin') {
            currentNumber = Math.sin(currentNumber);
            display.value = currentNumber;
        } else if (id === 'cos') {
            currentNumber = Math.cos(currentNumber);
            display.value = currentNumber;
        } else if (id === 'tan') {
            currentNumber = Math.tan(currentNumber);
            display.value = currentNumber;
        } else if (id === 'log') {
            currentNumber = Math.log(currentNumber);
            display.value = currentNumber;
        } else if