$(function(){

	console.log("TESTE");
	var data = [];
	var pagos = [];
	var qtd = [];
      

       //var res = null;
       var res =  $.ajax({
            url: 'http://localhost:8080/picoles',
            method: 'GET',
            dataType: 'json'
        });

        res.done(function(dados) {
        	
            dados.forEach(function(dado) {
            	data.unshift(dado.data);
            	pagos.unshift(dado.pagos);
            	qtd.unshift(dado.quantidade);
            	console.log(data);
               
                
             });
        
        
       
        
        
       
        
        var ctx = document.getElementById('chart').getContext('2d');
          

         //Grafico com dados dos batimentos cardíacos
       	 chart1  =  new Chart(ctx, {
                    type: 'line',
//                    responsive: true,
                    data: {
                        labels: data,
                        datasets: [{
                                    label: "Pagos",
                                    data: pagos,
                                    fill: false,
                                    backgroundColor: '#006400',
                                    borderColor: '#006400'
                                   },{
                                       label: "Total",
                                       data: qtd,
                                       fill: false,
                                       backgroundColor: '#FF0000',
                                       borderColor: '#FF0000'
                                      }
                        ]
                 }
         });
       	 window.chart1.update();
        
      
        }); 
        res.fail(function() {
            alert('Erro!!Verifique sua conexão!!!');
        });
    });
