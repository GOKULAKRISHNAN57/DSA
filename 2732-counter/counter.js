/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {

    let count = 0;   
    return function() {

        if(count == 0){
            count++
            return n;
        }
        else{
            n = n+1;
            return n;
        }
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */