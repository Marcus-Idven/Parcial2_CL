using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Services;
using System.Xml;
using Npgsql;

namespace VO.Web
{


    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class bdpostgres : System.Web.Services.WebService
    {
        [WebMethod]
        public DataTable muestra dbProducto()
        {
            //conectando al servidor postgresql
            String IcCommand;
            String IcCadena = ConfigurationManager.ConnectionStrings["postgreSQL"].ConnectionString;
            NpgsqlConnection loConexion = new NpgsqlConnection();
            try
            {
                IoConexion = new NpgsqlConnection(IcCadena);
                IoConexion.Open();
            }
            catch (NpgsqlException e)
            {
                e.ToString();
            }
         
            DataSet ds = new DataSet();
            DataTable dt = new DataTable();
            IcCommand = "SELECT*FROM TBLPRODUCGTO();";
            NpgsqlDataAdapter da = new NpgsqlDataAdapter(IcCommand, IoConexion);
            ds.Reset();
            da.Fill(ds);
            dt = ds.Tables[0];
 

            IOConexion.close();
        
            return dt;


        }



    }
}
