// o que são vetores ou array

// como declarar um array
//let array = ['string', 1, true];
//console.log(array);

let array = ['string', 1, true, ['array1'], ['array2'], ['array3'], ['array4']];
console.log(array[3]);

// forEach
//array.forEach(function(item, index){console.log(item, index)});

// push
//array.push('novo item');
//console.log(array)

//pop
//array.pop();
///console.log(array);

// shift
//array.shift();
//console.log(array);

//unshift
//array.unshift('novo - intem no inicio');
//console.log(array);

//indexOf
//console.log(array.indexOf(true));

//splice
//array.splice(0, 3);
//console.log(array);

//slice
//let novoArray = array.slice(0, 3);
//console.log(novoArray);

let object = { string: 'string', number: 1, Boolean: true, array: ["array"], objectInterno: { obejectInterno: 'objeto interno'}};
console.log(object.Boolean);

//var string = object.string;
//console.log(string);

//var arrayInterno = object.array;
//console.log(arrayInterno);

var {string, Boolean, objectInterno} = object;
console.log(string, Boolean, objectInterno);