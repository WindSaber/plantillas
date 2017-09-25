//Declarando la app
var myApp = angular.module('myApp', []);
//Declarando el controllador
myApp.controller('PlantillasCtrl', function ($scope, $http) {
    $scope.initPlantillas = function () {
        $scope.mostrar_controles_nueva = false;
        $scope.cargaPlantillas();
    }
    $scope.cargaPlantillas = function(){
        $http.get("api/plantillas/getAll").then(function(response){
            $scope.plantillas_actuales = response.data;
            console.log($scope.plantillas_actuales)
        });
    }
    $scope.seleccionarPlantilla = function(plantilla){
        $scope.plantilla_sel = plantilla;
        $scope.mostrar_controles_nueva = false;
    }
    $scope.mostrarAgregarPlantilla = function(){
        $scope.mostrar_controles_nueva = true;
    }
});

function x() {
    return [
        {
            id: 1,
            nombre: 'RC_ENDOSO',
            url: 'C:\\plantillas\\endoso.jxrml',
            campos: [
                {id: 1, nombre: "clave"},
                {id: 2, nombre: "asegurado"},
                {id: 3, nombre: "prima"},
                {id: 4, nombre: "endoso"}
            ]
        },
        {
            id: 2,
            nombre: 'POLZIA',
            url: 'C:\\plantillas\\endoso.jxrml',
            campos: [
                {id: 1, nombre: "clave"},
                {id: 2, nombre: "asegurado"},
                {id: 3, nombre: "prima"},
                {id: 4, nombre: "endoso"}
            ]
        },
        {
            id: 3,
            nombre: 'Cedula',
            url: 'C:\\plantillas\\endoso.jxrml',
            campos: [
                {id: 1, nombre: "clave"},
                {id: 2, nombre: "asegurado"},
                {id: 3, nombre: "prima"},
                {id: 4, nombre: "endoso"}
            ]
        },
        {
            id: 4,
            nombre: 'OTRA CEDULA',
            url: 'C:\\plantillas\\endoso.jxrml',
            campos: [
                {id: 1, nombre: "clave"},
                {id: 2, nombre: "asegurado"},
                {id: 3, nombre: "prima"},
                {id: 4, nombre: "endoso"}
            ]
        }
    ];
}