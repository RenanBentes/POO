const Produto = require('./produto');
const Empresa = require('./empresa');

const produto1 = new Produto("Notebook", 3000);
const empresa1 = new Empresa("TechCom", "Joinville");

produto1.exibir();
empresa1.exibir();
