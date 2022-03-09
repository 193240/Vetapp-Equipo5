import React, {Component} from 'react'
import { AiOutlineEye } from 'react-icons/all';


export default class loginComponent extends Component {
    render() {
        return (
            <div className="container login rounded  px-5 pt-4" id="login">
                <form>
                    <legend className="fw-bold text-center ">Iniciar sesion</legend>

                    <div className="alertas">
                        <div className="alert alert-success succes-alert py-0" role="alert">
                            <p className="mb-0">Registro exitoso!</p>
                            <p className="mb-0">Ya puede ingresar</p>
                        </div>
                        <div className="alert alert-danger py-0 alert-login" role="alert">

                        </div>
                    </div>
                    <div className="mb-3">
                        <label htmlFor="exampleInputEmail1" className="form-label">Email address</label>
                        <input type="email" className="form-control" id="login_mail" name="mail_login"
                               aria-describedby="emailHelp"
                               placeholder="Mail" required></input>
                    </div>

                    <label htmlFor="" className="form-label">Password</label>
                    <div className="input-group mb-3">
                        <input type="password" className="form-control " name="login_password"
                               id="login_pass"
                               placeholder="Contraseña" required></input>
                        <button className="btn btn-outline-dark " type="button" id="togglePassword">
                            <AiOutlineEye/>
                        </button>
                    </div>
                    <footer className="d-grid">
                        <button type="button" className="btn btn-dark " name="iniciar_sesion"
                                id="logearse">Iniciar
                        </button>
                    </footer>

                </form>
            </div>
        )
    }
}