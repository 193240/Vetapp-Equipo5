import React, {Component} from 'react'
import { useState } from 'react'
import fondo from './assets/Imagenes/img.png';
import RegisterComponent from'./registerComponent'
import LoginComponent from'./loginComponent'

export default class Registro extends Component {
    constructor() {
        super();
        this.state = { checked: true };
        this.handleChange = this.handleChange.bind(this);
    }
    handleChange(checked) {
        this.setState({ checked });
    }
    render() {
        return (

                <div className=" ht d-flex align-items-center justify-content-center px-5"style={imgB}>
                    <div className=" caja-todo  px-5">
                        <div className="container  transparente shadow d-flex align-items-center justify-content-center text-white rounded">
                            <div className="container text-center">
                                <h3>¿Ya tienes una cuenta?</h3>
                                <p>Inicia sesion para Ingresar </p>
                                <footer className="d-grid">
                                    <button type="button" id="btn_login" className="btn btn-outline-light"
                                             onClick={() => this.handleChange(true)}
                                            >
                                        Iniciar sesion
                                    </button>
                                </footer>
                            </div>
                            <div className="container text-center">
                                <h3>¿Aún no tienes cuenta?</h3>
                                <p>Registrate para Ingresar</p>
                                <footer className="d-grid">
                                    <button type="button" id="btn_register"
                                            className="btn btn-outline-light"
                                            onClick={() => this.handleChange(false)}
                                            >Registrarse
                                    </button>
                                </footer>
                            </div>
                        </div>

                        <div className="caja-frontal">

                            {this.state.checked ?
                                (
                                <LoginComponent/>

                            ) : (
                                <RegisterComponent/>

                                )
                            }

                        </div>
                    </div>
                </div>

        )
    }
}
/*const [inicio, setInicio]  = useState();

const [registro, setRegistro] = useState('');*/

/*const clickRegistro = () =>{
    setRegistro();
}
const clickLogin = () =>{
    setInicio();
}*/
const imgB = {
    background: `url(${fondo}) center/cover`,
    height: '100vh'
}
