package org.example;

import javax.persistence.*;

@Entity
    @Table(name = "usuarios")
    public class Usuario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column()
        private String nombre;

        @Column()
        private String apellido;

        @Column()
        private String correoElectronico;

        // Constructor sin argumentos
        public Usuario() {
        }

        public Usuario(Long id, String nombre, String apellido, String correoElectronico) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.correoElectronico = correoElectronico;
        }

        // Getters y Setters para cada propiedad
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getCorreoElectronico() {
            return correoElectronico;
        }

        public void setCorreoElectronico(String correoElectronico) {
            this.correoElectronico = correoElectronico;
        }
    }

