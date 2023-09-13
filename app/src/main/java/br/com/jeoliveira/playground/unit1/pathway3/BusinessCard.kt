package br.com.jeoliveira.playground.unit1.pathway3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.jeoliveira.playground.R

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier
            .background(color = Color(0xFF9CAF88))
            .padding(8.dp)
    ) {
        ProfileInfo(modifier)
        Spacer(Modifier.height(150.dp))
        ContactInfo(modifier)
    }
}

@Composable
fun ProfileInfo(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(R.drawable.profile_picture),
            contentDescription = "Profile picture of the business card",
            contentScale = ContentScale.Crop,
            modifier = modifier
                .size(150.dp)
                .clip(CircleShape)
                .border(1.dp, Color.LightGray, CircleShape)
        )
        Text(
            text = "José Oliveira",
            color = Color.Black,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Android Developer",
            color = Color(0xFF0A5C36),
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun ContactInfo(modifier: Modifier = Modifier) {
    Column {
        Row {
            Icon(
                imageVector = Icons.Rounded.Phone,
                tint = Color(0xFF0A5C36),
                contentDescription = "Phone number",
                modifier = modifier.padding(end = 5.dp)
            )
            Text("+55 (98) 98900 4911")
        }
        Row {
            Icon(
                imageVector =  Icons.Rounded.Share,
                contentDescription = "Social media",
                tint = Color(0xFF0A5C36),
                modifier = modifier.padding(end = 5.dp)
            )
            Text("linkedin/jeoliveira94")
        }
        Row {
            Icon(
                imageVector =  Icons.Rounded.Email,
                contentDescription = "Email",
                tint = Color(0xFF0A5C36),
                modifier = modifier.padding(end = 5.dp)
            )
            Text("oliveiras.je94@gmail.com")
        }
    }
}


