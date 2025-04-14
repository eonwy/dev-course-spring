const clap = () => {
  console.log();
  console.log(`👏👏👏👏👏👏👏👏👏👏👏👏👏👏👏👏👏👏👏👏`);
  console.log();
}

const odd = '홀수';
const even = '짝수';
const kyw = {
  username : '김예원',
  age : 25
}

let count = 0;

const counter = () => {
  count++;
  console.dir(count);
}

export {odd, even, kyw, counter};
export default clap;