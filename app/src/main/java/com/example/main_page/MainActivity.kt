package com.example.main_page

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.Text
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ScreenMain() {
    val primaryColor = Color(0xFF5A5AB0)
    val textGreyColor = Color(0xFF808080)
    val lightGreyColor = Color(0xFFD3D3D3)
    val outerBackgroundColor = Color(0xFFEDE7F6)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(outerBackgroundColor)
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White, RoundedCornerShape(24.dp))
                .padding(24.dp)
        ) {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(bottom = 24.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .size(width = 200.dp, height = 150.dp)
                            .align(Alignment.CenterStart)
                            .offset(x = 10.dp, y = 10.dp)
                            .background(Color(0xFFECEFF1), RoundedCornerShape(16.dp))
                    )

                    Box(modifier = Modifier.size(10.dp).align(Alignment.TopStart).offset(x=20.dp, y=20.dp).background(primaryColor, CircleShape))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(lightGreyColor)
                            .align(Alignment.BottomCenter)
                            .padding(horizontal = 16.dp)
                    )
                }

                Box(modifier = Modifier.height(32.dp))

                Text(
                    text = "Hello",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.W700,
                    color = Color.Black
                )

                Box(modifier = Modifier.height(16.dp))

                Text(
                    text = "Welcome To Little Drop, where you manage you daily tasks",
                    fontSize = 16.sp,
                    color = textGreyColor,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 24.dp)
                )

                Box(modifier = Modifier.height(48.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .background(primaryColor, RoundedCornerShape(28.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Login",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }

                Box(modifier = Modifier.height(16.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .border(
                            width = 2.dp,
                            color = primaryColor,
                            shape = RoundedCornerShape(28.dp)
                        )
                        .background(Color.White, RoundedCornerShape(28.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Sign Up",
                        color = primaryColor,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }

                Box(modifier = Modifier.height(32.dp))

                Text(
                    text = "Sign up using",
                    fontSize = 14.sp,
                    color = textGreyColor
                )

                Box(modifier = Modifier.height(16.dp))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .background(Color(0xFF3B5998), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "f",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                    }

                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .background(Color(0xFFEA4335), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "G+",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    }

                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .background(Color(0xFF0077B5), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "in",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                    }
                }
                Box(modifier = Modifier.height(24.dp))
            }
        }
    }
}