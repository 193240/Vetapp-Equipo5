import React, {Component} from 'react'

import { AiOutlineEye } from 'react-icons/all';

export default class registerComponent extends Component {
    render() {
        return (
            <div className="container rounded register  pt-3">
            <form action="#" encType="multipart/form-data" autoComplete="off">
                <legend className="fw-bold text-center">Registro</legend>
                <div className="alert alert-danger alert-register py-0" id="liveAlertR"
                     role="alert">

                </div>

                <div className="">
                    <label htmlFor="exampleInputEmail1" className="form-label">Usuario</label>
                    <input type="text" className="form-control" id="user" name="register_user"
                           aria-describedby="emailHelp"
                           placeholder="Nuevo usuario" required></input>
                </div>
                <label htmlFor="" className="form-label">Password</label>
                <div className="input-group mb-3">
                    <input type="password" className="form-control" name="register_password"
                           id="user_pass"
                           placeholder="Contraseña" required></input>
                    <button className="btn btn-outline-primary outline-pass" type="button" id="togglePassword2">
                        <AiOutlineEye/>
                    </button>
                </div>
                <div className="form-check mb-3">
                    <input className="form-check-input" type="checkbox" value=""
                           id="flexCheckDefault"></input>
                    <label className="form-check-label" htmlFor="flexCheckDefault">
                        Dueño
                    </label>
                </div>
                {/* <div className="row">
                                        <div className=" col">
                                            <label htmlFor="formGroupExampleInput" className="form-label">Nombre</label>
                                            <input type="text" className="form-control" name="nombre" id="nombre_user"
                                                   placeholder="Nombre" required></input>
                                        </div>
                                        <div className=" col">
                                            <label htmlFor="formGroupExampleInput"
                                                   className="form-label">Apellido</label>
                                            <input type="text" className="form-control" name="apellido"
                                                   id="apellido_user"
                                                   placeholder="Apellido" required></input>
                                        </div>
                                    </div>*/}
                <div className="d-grid">
                    <button type="submit" className="btn btn-ttc registro-btn " name="registro"
                            id="registrar">Registrarse
                    </button>
                </div>

            </form>
        </div>

        )
    }
}
