package com.android.registerlayoutdenganconstraintlayoutdecoupledapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.layoutId
import com.android.registerlayoutdenganconstraintlayoutdecoupledapi.ui.theme.RegisterLayoutDenganConstraintLayoutDecoupledApiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun RegisterLayout() {

    var constraint = ConstraintSet {
        val title = createRefFor("title")
        var inputNama = createRefFor("inputNama")
        var inputNim = createRefFor("inputNim")
        var inputNoHp = createRefFor("inputNoHp")
        var inputAlamat = createRefFor("inputAlamat")
        var inputEmail = createRefFor("inputEmail")
        var inputPass = createRefFor("inputPass")
        var inputConfPass = createRefFor("inputConfPass")
        var btnRegister = createRefFor("btnRegister")
        var subTitle = createRefFor("subTitle")

        constrain(title) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top, 94.dp)
        }
        constrain(inputNama) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(title.bottom, 28.dp)
        }
        constrain(inputNim) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(inputNama.bottom, 28.dp)
        }
        constrain(inputNoHp) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(inputNim.bottom, 28.dp)
        }
        constrain(inputAlamat) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(inputNoHp.bottom, 28.dp)
        }
        constrain(inputEmail) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(inputAlamat.bottom, 28.dp)
        }
        constrain(inputPass) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(inputEmail.bottom, 28.dp)
        }
        constrain(inputConfPass) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(inputPass.bottom, 28.dp)
        }
        constrain(btnRegister) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(inputConfPass.bottom, 28.dp)
        }
        constrain(subTitle) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(btnRegister.bottom, 15.dp)
        }
    }

    ConstraintLayout(
        constraintSet = constraint,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(start = 25.dp, end = 25.dp)
    ) {
        Text(
            text = "Register",
            fontSize = 24.sp,
            fontFamily = FontFamily(Font(R.font.aclonica)),
            color = Color(R.color.blue),
            modifier = Modifier.layoutId("title")
        )

        TextField(
            value = "Nama lengkap",
            onValueChange = {},
            textStyle = TextStyle(
                color = Color(R.color.blue),
                fontFamily = FontFamily(
                    Font(R.font.poppins_reguler)
                ),
                fontSize = 14.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .layoutId("inputNama"),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        TextField(
            value = "No identitas",
            onValueChange = {},
            textStyle = TextStyle(
                color = Color(R.color.blue),
                fontFamily = FontFamily(
                    Font(R.font.poppins_reguler)
                ),
                fontSize = 14.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .layoutId("inputNim"),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        TextField(
            value = "No hp",
            onValueChange = {},
            textStyle = TextStyle(
                color = Color(R.color.blue),
                fontFamily = FontFamily(
                    Font(R.font.poppins_reguler)
                ),
                fontSize = 14.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .layoutId("inputNoHp"),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        TextField(
            value = "Alamat",
            onValueChange = {},
            textStyle = TextStyle(
                color = Color(R.color.blue),
                fontFamily = FontFamily(
                    Font(R.font.poppins_reguler)
                ),
                fontSize = 14.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .layoutId("inputAlamat"),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        TextField(
            value = "Email",
            onValueChange = {},
            textStyle = TextStyle(
                color = Color(R.color.blue),
                fontFamily = FontFamily(
                    Font(R.font.poppins_reguler)
                ),
                fontSize = 14.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .layoutId("inputEmail"),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        TextField(
            value = "Password",
            onValueChange = {},
            textStyle = TextStyle(
                color = Color(R.color.blue),
                fontFamily = FontFamily(
                    Font(R.font.poppins_reguler)
                ),
                fontSize = 14.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .layoutId("inputPass"),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        TextField(
            value = "Confirm password",
            onValueChange = {},
            textStyle = TextStyle(
                color = Color(R.color.blue),
                fontFamily = FontFamily(
                    Font(R.font.poppins_reguler)
                ),
                fontSize = 14.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .layoutId("inputConfPass"),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .layoutId("btnRegister")
                .width(178.dp)

        ) {
            Text(
                text = "Simpan",
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.poppins_bold))
            )
        }

        Row(
            modifier = Modifier
                .layoutId("subTitle")
                .fillMaxWidth(),horizontalArrangement = Arrangement.Center
        ) {
            Row() {
                Text(
                    text = "Already Have an Account ?",
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                    color = Color(R.color.blue)
                )
                Text(
                    text = "Sign In",
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    color = Color(R.color.blue)
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewRegisterLayout() {
    RegisterLayout()
}

