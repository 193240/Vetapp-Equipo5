import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import {BrowserRouter} from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import './Componentes/assets/css/registro.css'
ReactDOM.render(
  <BrowserRouter>
    <App />
  </BrowserRouter>,
document.getElementById('root')
);