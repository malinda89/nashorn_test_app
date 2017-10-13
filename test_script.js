var getEmployees = function () {
    // var hashmap = Java.type('java.util.HashMap')
    // map = new hashmap()

    var map = new java.util.HashMap()
    map.put(1, 'Salitha');
    map.put(2, 'Malinda');
    map.put(3, 'Namodaya');
    map.put(4, 'Dasun');
    return map;
}

var getNumArr = function () {
    return Java.to([3, 5, 7, 11], "int[]");
}

