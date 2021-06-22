"use strict";

var _interopRequireDefault = require("@babel/runtime/helpers/interopRequireDefault");

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.getConnetion = void 0;

var _promiseMysql = _interopRequireDefault(require("promise-mysql"));

var _config = _interopRequireDefault(require("../config"));

var dbSettings = {
  host: _config["default"].dbHost,
  user: _config["default"].dbUser,
  password: _config["default"].dbPassword,
  database: _config["default"].dbDatabase
}; //Recupera la conexion a la base de datos

var getConnetion = function getConnetion() {
  var connetion = null;

  try {
    connetion = _promiseMysql["default"].createConnection(dbSettings);
  } catch (e) {
    console.error("database connetion error -- osea paso algo XD");
  }

  return connetion;
};

exports.getConnetion = getConnetion;