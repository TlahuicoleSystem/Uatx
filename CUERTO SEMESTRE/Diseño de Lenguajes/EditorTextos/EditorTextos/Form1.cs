using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;
using System.Collections;

namespace EditorTextos
{
    public partial class Form1 : Form
    {
        String archivo;
        public string operacion(string renglon)
        {
            float a, b, resultado = 0;
            string salida, auxresultado = "true";
            string[] palabra = renglon.Split(',');
            switch (palabra[0])
            {
                case "sum":
                    a = float.Parse(palabra[1]);
                    b = float.Parse(palabra[2]);
                    resultado = a + b;
                    break;
                case "res":
                    a = float.Parse(palabra[1]);
                    b = float.Parse(palabra[2]);
                    resultado = a - b;
                    break;
                case "div":
                    a = float.Parse(palabra[1]);
                    b = float.Parse(palabra[2]);
                    resultado = a / b;
                    break;
                case "mul":
                    a = float.Parse(palabra[1]);
                    b = float.Parse(palabra[2]);
                    resultado = a * b;
                    break;
                default:
                    auxresultado = "false";
                    break;
            }
            if (auxresultado == "false")
            {
                salida = "Lo sentimos revise su escritura";
            }
            else
            {
                salida = "El resultado es. " + string.Concat(resultado);
            }
            return salida;
        }


        public Form1()
        {
            InitializeComponent();
        }

        private void abrirToolStripMenuItem_Click(object sender, EventArgs e)
        {
            OpenFileDialog OpenFile = new OpenFileDialog(); //Para que aparesca el la venta y abra el archivo
            OpenFile.Filter = "Texto |*.txt";
            if (OpenFile.ShowDialog() == DialogResult.OK)
            {
                archivo = OpenFile.FileName;
                using (StreamReader sr = new StreamReader(archivo))
                {
                    entrada.Text = sr.ReadToEnd(); 
                }
            }
            Form1.ActiveForm.Text = archivo + " Calculadora Nancy ";
        }

        private void nuevoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            entrada.Clear();
            archivo = null;
            Form1.ActiveForm.Text = archivo + " Calculadora Nancy ";
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void guardarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            SaveFileDialog saveFile = new SaveFileDialog();
            saveFile.Filter = "Texto |*.txt";
            if (archivo != null)
            {
                using (StreamWriter sw = new StreamWriter(archivo))
                {
                    sw.Write(entrada.Text);
                }
            }
            else
            {
                if(saveFile.ShowDialog() == DialogResult.OK)
                {
                    archivo = saveFile.FileName;
                    using (StreamWriter sw = new StreamWriter(saveFile.FileName))
                    {
                        sw.Write(entrada.Text);
                    }
                }
            }
        }

        private void cerrarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.Dispose();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //BOTON PARA EJECUTAR
            
            string original = entrada.Text, mensajeSalida = "";
            string[] renglon = original.Trim().Split(';');
            int tamaño = renglon.Length;
            tamaño--;
            for (int i = 0; i < tamaño; i++)
            {
               mensajeSalida = mensajeSalida + operacion(renglon[i].Replace(" ", "").Replace("\n", "")) + "\n";
            }
            salida.Text = mensajeSalida + "\nProceso terminado";
        }
    }
}
