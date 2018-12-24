   var exec = require('cordova/exec');
   module.exports = {
           requestLocation: function (success,error){
           exec(success,error,"BDLocationPlugin","requestLocation",["location"]);
           }
       }