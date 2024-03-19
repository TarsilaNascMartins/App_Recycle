package br.com.fiap.myapplication.screens



import androidx.compose.foundation.Image
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.fiap.myapplication.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CadastroScreen(navController: NavHostController) {

    //para que variável mude de estado e se lembre
    var nomeUsuario = remember {
        mutableStateOf("")
    }

    var feminino by remember {
        mutableStateOf(false)
    }

    var masculino by remember {
        mutableStateOf(false)
    }
    var naoInformado by remember {
        mutableStateOf(false)
    }

    var botaoCadastrar by remember {
        mutableStateOf(Color.Gray)
    }


    Column(
        //modificadores do container coluna
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)


    ) {
        Image(
            painterResource(id = R.drawable.logo ) , contentDescription ="Logo da Marca",
            modifier = Modifier
                .size(300.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = "XXXXXX XXXXXX",
            fontSize = 25.sp,
            color = Color(0xffDA878F),
            modifier = Modifier
                .offset(y = (-60).dp)
                .align(Alignment.CenterHorizontally),
            fontWeight = FontWeight.SemiBold

        )

        //espaço entre os textField
        Spacer(modifier = Modifier.height(1.dp))

        // entrada de valor pelo usuário:
        OutlinedTextField(
            value = nomeUsuario.value,
            onValueChange = { novoValor ->
                nomeUsuario.value = novoValor
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().background(Color.Transparent),   //o texto ocupa a extensão toda na horizontal
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Sentences // permite que o teclado deixa a primeira letra maiúscula
            ),

            // texto de dentro, sai quando o usuário digita
            label = {
                Text(text = "Qual o seu nome?")
            },

            //dica que fica em cima
            placeholder = {
                Text(text = "Nome do usuário")
            },

            //ícone do início do TextField
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "ícone de um usuário ",
                    tint = Color(0xffDA878F)
                )
            },

            //ícone do final do textField
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable._info),
                    contentDescription = "ícone de informação",
                    tint = Color(0xffDA878F)
                )

            },
            textStyle = TextStyle(fontSize = 20.sp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color(0xffDA878F),
                unfocusedTextColor = Color.Gray,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                focusedBorderColor = Color(0xffDA878F), // Cor da borda quando o campo está em foco
                unfocusedBorderColor = Color.Gray, // Cor da borda quando o campo não está em foco
            )


        )

        //espaço entre os textField
        Spacer(modifier = Modifier.height(20.dp))

        var quantidade = remember {
            mutableStateOf("")
        }

//para que variável mude de estado e se lembre
        var emailUsuario = remember {
            mutableStateOf("")
        }

        OutlinedTextField(
            value = emailUsuario.value,
            onValueChange = { novoValor ->
                emailUsuario.value = novoValor
            },
            //o texto ocupa a extensão toda na horizontal
            modifier = Modifier.fillMaxWidth()    .background(Color.Transparent),
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email // permite que o teclado deixa a primeira letra maiúscula
            ),
            // texto de dentro, sai quando o usuário digita
            label = {
                Box(
                    modifier = Modifier
                                            .padding(horizontal = 4.dp) // Ajusta o padding do label
                )
                Text(text = "Qual o seu e-mail?"
                    )
            },
            placeholder = {
                Box(
                    modifier = Modifier

                        .padding(horizontal = 4.dp) // Ajusta o padding do label
                )
                Text(text = "E-mail?")
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_email_24),
                    contentDescription = "ícone de informação",
                    tint = Color(0xffDA878F)
                )
            },
            textStyle = TextStyle(fontSize = 20.sp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color(0xffDA878F),
                unfocusedTextColor = Color.Gray,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                focusedBorderColor = Color(0xffDA878F), // Cor da borda quando o campo está em foco
                unfocusedBorderColor = Color.Gray, // Cor da borda quando o campo não está em foco
            )


        )
//espaço entre os textField
        Spacer(modifier = Modifier.height(20.dp))

//para que variável mude de estado e se lembre
        var senhaConfirmadaUsuario = remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            value = senhaConfirmadaUsuario.value,
            onValueChange = { novoValor ->
                senhaConfirmadaUsuario.value = novoValor
            },
            //o texto ocupa a extensão toda na horizontal
            modifier = Modifier.fillMaxWidth(),

            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.NumberPassword // permite que o teclado deixa a primeira letra maiúscula
            ),
            // texto de dentro, sai quando o usuário digita
            label = {
                Text(text = "Senha")
            },
            placeholder = {
                Text(text = "Qual será a sua senha?")
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_password_24),
                    contentDescription = "ícone de informação",
                    tint = Color(0xffDA878F)
                )
            },
            textStyle = TextStyle(fontSize = 20.sp),

            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color(0xffDA878F),
                unfocusedTextColor = Color.Gray,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                focusedBorderColor = Color(0xffDA878F), // Cor da borda quando o campo está em foco
                unfocusedBorderColor = Color.Gray, // Cor da borda quando o campo não está em foco
            )


        )
//espaço entre os textField
        Spacer(modifier = Modifier.height(20.dp))

//para que variável mude de estado e se lembre
        var senhaUsuario = remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            value = senhaUsuario.value,
            onValueChange = { novoValor ->
                senhaUsuario.value = novoValor
            },
            shape = RoundedCornerShape(10.dp),
            //o texto ocupa a extensão toda na horizontal
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.NumberPassword // permite que o teclado deixa a primeira letra maiúscula
            ),
            // texto de dentro, sai quando o usuário digita
            label = {
                Text(text = "Confirme a Senha")
            },

            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_password_24),
                    contentDescription = "ícone de informação",
                    tint = Color(0xffDA878F)
                )
            },
            textStyle = TextStyle(fontSize = 20.sp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color(0xffDA878F),
                unfocusedTextColor = Color.Gray,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                focusedBorderColor = Color(0xffDA878F), // Cor da borda quando o campo está em foco
                unfocusedBorderColor = Color.Gray, // Cor da borda quando o campo não está em foco
            )

        )



        //espaço entre os textField
        Spacer(modifier = Modifier.height(5.dp))

        var generoSelecionado by remember {
            mutableStateOf(-1)
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = generoSelecionado == 0,
                onClick = { generoSelecionado = 0 },
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color(0xffDA878F),
                    unselectedColor = Color(0xffDA878F)
                )
            )
            Text(text = "Não informar", fontSize = 11.sp)

            RadioButton(
                selected = generoSelecionado == 1,
                onClick = { generoSelecionado = 1 },
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color(0xffDA878F),
                    unselectedColor = Color(0xffDA878F)
                )
            )
            Text(text = "Feminino", fontSize = 11.sp)

            RadioButton(
                selected = generoSelecionado == 2,
                onClick = { generoSelecionado = 2 },
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color(0xffDA878F),
                    unselectedColor = Color(0xffDA878F),

                )
            )
            Text(text = "Masculino", fontSize = 11.sp)
        }

        //espaço entre os textField
        Spacer(modifier = Modifier.height(20.dp))

        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(

                onClick = {
                    navController.navigate("home")
                },
                shape = RoundedCornerShape(25.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff80A99A))

            ) {
                Text(text = "Cadastrar")
                Icon(
                    painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                    contentDescription = "Seta"
                )
            }


        }

    }
}


