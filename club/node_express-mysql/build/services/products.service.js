"use strict";

var _interopRequireDefault = require("@babel/runtime/helpers/interopRequireDefault");

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.getAllProductsService = void 0;

var _regenerator = _interopRequireDefault(require("@babel/runtime/regenerator"));

var _asyncToGenerator2 = _interopRequireDefault(require("@babel/runtime/helpers/asyncToGenerator"));

var _database = require("../database/database");

var getAllProductsService = /*#__PURE__*/function () {
  var _ref = (0, _asyncToGenerator2["default"])( /*#__PURE__*/_regenerator["default"].mark(function _callee() {
    var productsList, conn;
    return _regenerator["default"].wrap(function _callee$(_context) {
      while (1) {
        switch (_context.prev = _context.next) {
          case 0:
            productsList = null;
            _context.prev = 1;
            _context.next = 4;
            return (0, _database.getConnetion)();

          case 4:
            conn = _context.sent;
            _context.next = 7;
            return conn.query('SELECT * FROM products');

          case 7:
            productsList = _context.sent;
            _context.next = 13;
            break;

          case 10:
            _context.prev = 10;
            _context.t0 = _context["catch"](1);
            throw _context.t0.message;

          case 13:
            return _context.abrupt("return", productsList);

          case 14:
          case "end":
            return _context.stop();
        }
      }
    }, _callee, null, [[1, 10]]);
  }));

  return function getAllProductsService() {
    return _ref.apply(this, arguments);
  };
}();

exports.getAllProductsService = getAllProductsService;