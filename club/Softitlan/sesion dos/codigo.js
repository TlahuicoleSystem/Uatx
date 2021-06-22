$(document).ready(function() {
    //$('#cancel_button').removeAttr('hidden');
    
    let b = $('<div></div>')
    b.addClass('btn btn-info');
    b.html('boton de prueba');
    $('#my_card_body').append(b);

    $.ajax({
        url: 'http://3.136.184.236:8081/persona/findAll?page=0&size=10',
    }).done(function (response) {
        console.log(response);
        if (response.success === true) {
            for (let i = 0; i < response.data.length; i++) {
                addRow(response.data[i]);
            }
        }
    });

/*
addRow({
    id: 1,
    firstName: 'Josue',
    lastName: 'Barrales',
    age: 19,
    gender: 1
});

addRow({
    id: 2,
    firstName: 'Pablo',
    lastName: 'Perez',
    age: 40,
    gender: 2
});

*/


});
let addRow = function(rowData) {
    $('#mytbody').append(
        $('<tr></tr>')
            .append(
                $('<td></td>')
                    .html(rowData.id)
            )
            .append(
                $('<td></td>')
                    .html(rowData.firstName)
            )
            .append(
                $('<td></td>')
                    .html(rowData.lastName)
            )
            .append(
                $('<td></td>')
                    .html(rowData.age)
            )
            .append(
                $('<td></td>')
                    .html(rowData.gender == 1 ? 'Male' : 'Female')
            )
    );
}


let myfunction = function() {

    setTimeout(function() {
        document.getElementById('cancel_button').removeAttribute('hidden');
    }, 1000);

    setTimeout(function() {
        document.getElementById('accept_button').setAttribute('hidden', true);
    }, 2000);

    let button3rd = document.createElement('div');
    button3rd.setAttribute('class', 'btn btn-info');
    button3rd.innerHTML = 'javascript created button';
    document.getElementById('my_card_body').appendChild(button3rd);
}