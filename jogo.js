class Hero{
    constructor(nome, idade, tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }
    atacar() {
        let ataque;
        switch (this.tipo) {
            case 'O mago':
                ataque = 'magia';               
                break;
        
            case 'A guerreira':
                ataque = 'espada';
                break;
            
            case 'O monge':
                ataque = 'artes marciais';
                break;

            case 'A ninja':
                ataque = 'shuriken';  
                break;  

            default:
                ataque = 'usou um ataque desconhecido';
                break;
        }
        console.log(` ${this.tipo} ${this.nome} atacou usando ${ataque}`);
    }
}
const heroiMago = new Hero('Orion', '130', 'O mago');
const heroiGuerreiro = new Hero('Riana', '30', 'A guerreira');
const heroiMonge = new Hero('Jetsun', '80', 'O monge');
const heroiNinja = new Hero('Hojo Massako', '35', 'A ninja');

heroiMago.atacar();
heroiGuerreiro.atacar();
heroiMonge.atacar();
heroiNinja.atacar();