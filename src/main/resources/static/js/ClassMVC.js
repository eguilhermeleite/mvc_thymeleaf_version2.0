class ClassMVC{
    constructor(){
        this._footer = document.getElementById("footer");
        this._locale = "pt-BR";
        this.showDate();
    }

    get currentDate(){
        return new Date();
    }

    showDate(){
        this._footer.innerHTML =`&copy ${this.currentDate.toLocaleDateString(this._locale,{year:"numeric"})} Todos o direitos reservados - Desenvolvido por Okawango` ;
    }
}