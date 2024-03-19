package br.com.fiap.fase1

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.CropFree

import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.fiap.myapplication.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    var busca by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        //Icons Perfil E Menu

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu",
                    tint = Color(0xff80A99A),
                    modifier = Modifier.size(35.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ },) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Perfil",
                    tint = Color(0xff80A99A),
                    modifier = Modifier.size(35.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(29.dp))

        //Search

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = busca,
                onValueChange = { busca = it },
                modifier = Modifier

                    .weight(1f)
                    .padding(end = 8.dp)
                    .shadow(elevation = 15.dp),
                shape = RoundedCornerShape((12.dp)),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Scan de embalagens",
                        tint = Color(0xffDA878F)
                    )
                },
                label = { Text(text = "Busque reciclagem do item", color = Color(0xffDA878F)) },
                placeholder = {
                    Text(
                        text = "Digite o item que gostaria de reciclar",
                        color = Color(0xffDA878F)
                    )
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.White,
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                )

            )

            //Icon Scan

            Card(
                modifier = Modifier
                    .height(47.dp)
                    .width(47.dp),
                onClick = { /*TODO*/ },
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xff80A99A)
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        modifier = Modifier.size(32.dp),
                        imageVector = Icons.Default.CropFree,
                        contentDescription = "Scan de embalagens",
                        tint = Color.White
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(35.dp))
        
        //Scroll cards obs: não consegui colocar a imagem do lado direito, então removi ela

        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xABDA878F)
                ),
                modifier = Modifier
                    .padding(start = 18.dp)
                    .size(width = 300.dp, height = 170.dp)
            ) {
                Row {
                    Column(
                        modifier = Modifier
                            .padding(23.dp)
                            .fillMaxWidth()
                            .height(170.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Ganhe Vouches de até 10% reciclando",
                            color = Color.White,
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff80A99A))
                        ) {
                            Text(text = "Saiba mais")
                        }

                    }
                }
            }
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xABDA878F)
                ),
                modifier = Modifier
                    .padding(start = 18.dp)
                    .size(width = 300.dp, height = 170.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(23.dp)
                        .fillMaxWidth()
                        .height(170.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Descubra dicas reciclaveis",
                        color = Color.White,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xff80A99A))
                    ) {
                        Text(text = "Dicas")
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(30.dp))

        //Cards com os icones clicaveis, coloquei duas cores para escolher
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Card(
                    modifier = Modifier
                        .clickable { /* ToDo */ }
                        .padding(24.dp)
                        .size(145.dp),
                    elevation = CardDefaults.cardElevation(4.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xAEF0F0F0)
                    )
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(16.dp)
                                    ,
                                painter = painterResource(id = R.drawable.map),
                                contentDescription = "Icon localização"
                            )
                            Text(
                                modifier =  Modifier.offset(y =(-12).dp),
                                text = "Pontos de Coleta",
                                fontSize = 15.sp,
                                color = Color(0xffABDA878F),
                                fontWeight = FontWeight.Bold
                            )

                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .clickable {
                            navController.navigate("cadastro de itens")
                        }
                        .padding(24.dp)
                        .size(145.dp),
                    elevation = CardDefaults.cardElevation(4.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xAEF0F0F0)
                    )
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(16.dp)
                                    .wrapContentHeight()
                                    .wrapContentWidth(),
                                painter = painterResource(id = R.drawable.cadastro),
                                contentDescription = "Icon cadastro de itens de reciclagem"
                            )
                            Text(
                                modifier =  Modifier.offset(y =(-12).dp),
                                text = "Cadastro de itens",
                                fontSize = 15.sp,
                                color = Color(0xffABDA878F),
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
            Row {
                Card(
                    modifier = Modifier
                        .clickable { /* ToDo */ }
                        .padding(24.dp)
                        .size(145.dp),
                    elevation = CardDefaults.cardElevation(4.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xAEF0F0F0)
                    )
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(16.dp)
                                    .wrapContentHeight()
                                    .wrapContentWidth(),
                                painter = painterResource(id = R.drawable.voucher1),
                                contentDescription = "Icon Vouchers"
                            )
                            Text(
                                modifier =  Modifier.offset(y =(-12).dp),
                                text = "Vouchers",
                                fontSize = 15.sp,
                                color = Color(0xff80A99A),
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .clickable { /* ToDo */ }
                        .padding(24.dp)
                        .size(145.dp),
                    elevation = CardDefaults.cardElevation(4.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xAEF0F0F0)
                    )
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(16.dp)
                                    .wrapContentHeight()
                                    .wrapContentWidth(),
                                painter = painterResource(id = R.drawable.partners),
                                contentDescription = "Icon cadastro de itens de reciclagem"
                            )
                            Text(
                                modifier =  Modifier.offset(y =(-12).dp),
                                text = "Empresas Parceiras",
                                fontSize = 15.sp,
                                color = Color(0xff80A99A),
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }

        }

    }




