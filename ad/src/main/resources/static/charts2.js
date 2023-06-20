//1er grafico
const data = {
    labels: ['Proceso Clinico', 'Interoperabilidad', 'Usabilidad', 'Fiabilidad', 'Seguridad'],
    datasets: [{
      label: 'Graficos Generales',
      data: [1.25, 3, 2.8, 2 , 2.8],
      backgroundColor:[
        'rgba(255, 26, 104, 0.2)',
        'rgba(255, 26, 104, 0.2)',
        'rgba(255, 26, 104, 0.2)',
        'rgba(255, 26, 104, 0.2)',
        'rgba(255, 26, 104, 0.2)'],
      borderColor:[
        'rgba(0, 0, 0, 1)',
        'rgba(0, 0, 0, 1)',
        'rgba(0, 0, 0, 1)',
        'rgba(0, 0, 0, 1)',
        'rgba(0, 0, 0, 1)'],
      borderWidth: 1
    }]
  };
  
  const config = {
    type: 'bar',
    data,
    options: {
      plugins: {
        subtitle:{
          display: true,
          text: 'Nota promedio POR AMBITO',
          align: 'center',
          position: 'left',
          font:{
            weight: 'bold',
            size: 14
  
          }
        },
        title:{
          display: true,
          text: 'Nota Promedio por Ambito',
          font:{
            size: 20
  
          }
        }
  
      },
      scales: {
        y: {
          beginAtZero: true
        }
      }
    }
  };
  
  const myChart = new Chart(
    document.getElementById('myChart'),
    config
  );
  
  
  //2do grafico
  const dataGraph2 = {
    labels: ['Proceso Clinico', 'Interoperabilidad', 'Usabilidad', 'Fiabilidad', 'Seguridad'],
    datasets: [{
      label: 'Graficos Generales',
      data: [69.00, 100.00, 89.00, 74.00, 89.00],
      backgroundColor: [
        'rgba(54, 162, 235, 0.2)',
        'rgba(54, 162, 235, 0.2)',
        'rgba(54, 162, 235, 0.2)',
        'rgba(54, 162, 235, 0.2)',
        'rgba(54, 162, 235, 0.2)'
      ],
      borderColor: [
        'rgba(0, 0, 0, 1)',
        'rgba(0, 0, 0, 1)',
        'rgba(0, 0, 0, 1)',
        'rgba(0, 0, 0, 1)',
        'rgba(0, 0, 0, 1)'
      ],
      borderWidth: 1
    }]
  };
  
  
  
  const config2 = {
    type: 'bar',
    data: dataGraph2,
    options: {
      plugins: {
        subtitle:{
          display: true,
          text: 'Cumplimiento por ambito',
          align: 'center',
          position: 'left',
          font:{
            weight: 'bold',
            size: 14
  
          }
        },
        title:{
          display: true,
          text: 'Porcentaje de Cumplimiento por ambito CENS',
          font:{
            size: 20
  
          }
  
        }
  
      },
      scales: {
        y: {
          beginAtZero: true
        }
      }
    }
  };
  
  const myChart2 = new Chart(
    document.getElementById('myChart2'),
    config2
  );
  
  
  //3er grafico
  const dataGraph3 = {
    labels: ['Plat 2','Plat 3','Plat 4','Plat 5'],
    datasets: [{
      label: 'Aspectos Calidad Cens',
      data: [69.00, 100.00, 89.00, 74.00, 89.00],
      backgroundColor: 'rgba(54, 162, 235, 0.2)',
      borderColor: 'rgba(0, 0, 0, 1)',
      borderWidth: 1
    },/*{
      label: 'Aspectos Tecnicos Fonasa',
      data: [76.00, 76.00 , 52.00, 48.00],
      backgroundColor:'rgba(255, 159, 64, 0.2)',
      borderColor:'rgba(0, 0, 0, 1)',
      borderWidth: 1
    }*/]
  };
  
  const config3 = {
    type: 'bar',
    data:dataGraph3,
    options: {
      plugins: {
        subtitle:{
          display: true,
          text: 'Cumplimiento Global',
          align: 'center',
          position: 'left',
          font:{
            weight: 'bold',
            size: 14
  
          }
        },
        title:{
          display: true,
          text: 'Porcentaje de Cumplimiento',
          font:{
            weight: 'bold',
            size: 20
  
          }
        },
  
      },
      scales: {
        y: {
          beginAtZero: true
        }
      }
    }
  };
  
  const myChart3 = new Chart(
    document.getElementById('myChart3'),
    config3
  );
  
  
  