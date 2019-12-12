const input = [
  "Simon 4",
  "Anna 10",
  "Simon 4",
  "Anna 9",
  "Anna 5",
  "Edward 10",
];

const output = input
  .map(s => s.split(" "))
  .map(([name, score]) => ({
    name: name,
    score: score,
  }))
  .reduce((a, c) => {
    if (a.hasOwnProperty(c.name)) {
      a[c.name].scores.push(Number.parseInt(c.score));
    } else {
      a[c.name] = {
        scores: [Number.parseInt(c.score)],
      };
    }
    return a;
  }, {});

const data = Object.entries(output).map(([k, v]) => {
  return {
    name: k,
    count: v.scores.length,
    average: v.scores.reduce((a, c) => a + c) / v.scores.length,
  };
});

const sortAlphabeticallyByName = (a, b) => {
  // Use toUpperCase() to ignore character casing
  const A = a.name;
  const B = b.name;

  let comparison = 0;
  if (A > B) {
    comparison = 1;
  } else if (A < B) {
    comparison = -1;
  }
  return comparison;
};

const sortByAverage = (a, b) => {
  // Use toUpperCase() to ignore character casing
  const A = a.average;
  const B = b.average;

  let comparison = 0;
  if (A < B) {
    comparison = 1;
  } else if (A > B) {
    comparison = -1;
  }
  return comparison;
};

console.log("Alpha order");
for (const item of data) {
  console.log(`${item.name} ${item.count} ${item.average.toFixed(1)}`);
}

data.sort(sortByAverage);
console.log("\nMerit order");
for (const [i, item] of data.entries()) {
  console.log(`${i + 1} ${item.name} ${item.count} ${item.average.toFixed(1)}`);
}
