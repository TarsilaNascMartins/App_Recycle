package br.com.fiap.myapplication.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.fiap.myapplication.model.Cupom


@Composable


fun CupomScreen(navController: NavHostController) {
    val cupons: List<Cupom> = listOf(
        Cupom(id = 2401, desconto = "25%", empresa = "ReStyle", categoria = "Shopping"),
        Cupom(id = 2402, desconto = "R$80", empresa = "EcoServe", categoria = "Serviços"),
        Cupom(id = 2403, desconto = "R$15", empresa = "Vibe Gourmet", categoria = "Alimentação"),
        Cupom(id = 2404, desconto = "10%", empresa = "Herbal Tea", categoria = "Bebida")
    )

    // Renderiza cada cupom como um CupomCard
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White) // Define a cor de fundo do Box
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            for (cupom in cupons) {
                CupomCard(cupom = cupom)
            }
        }
    }
}


@Composable
fun CupomCard(cupom: Cupom) {
    Card(modifier = Modifier.padding(bottom = 8.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .weight(3f)
            ) {
                Text(
                    text = "Empresa: ${cupom.empresa}",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Categoria: ${cupom.categoria}",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                )
            }
            // Botão "Adquirir" - substitua TODO com sua lógica de aquisição
            Button(
                onClick = { /* TODO: Adquirir cupom */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp),
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(
                  //  backgroundColor = Color.Green
                )
            ) {
                Text(text = "Adquirir")
            }
        }
        Text(
            text = "Desconto: ${cupom.desconto}",
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}


