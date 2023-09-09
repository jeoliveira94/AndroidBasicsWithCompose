package br.com.jeoliveira.playground

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ComposeQuadrantItem(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier) {

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(color = backgroundColor)
            .padding(16.dp),
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ComposeQuadrant() {
    Column (
        modifier = Modifier.fillMaxHeight()
    ){
        Row (
            Modifier.weight(1f)
        ) {
            ComposeQuadrantItem(
                title = stringResource(R.string.quadrant_first_title),
                description = stringResource(R.string.quadrant_first_description),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1F))
            ComposeQuadrantItem(
                title = stringResource(R.string.quadrant_second_title),
                description = stringResource(R.string.quadrant_second_description),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1F))
        }
        Row (
            Modifier.weight(1f)
        ){
            ComposeQuadrantItem(
                title = stringResource(R.string.quadrant_third_title),
                description = stringResource(R.string.quadrant_third_description),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1F))
            ComposeQuadrantItem(
                title = stringResource(R.string.quadrant_fourth_title),
                description = stringResource(R.string.quadrant_fourth_description),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1F))
        }
    }
}

@Preview
@Composable
fun ComposeQuadrantItemPreview() {
    ComposeQuadrantItem(
        title = "Text composable",
        description = "Displays text and follows the recommended Material Design guidelines.",
        backgroundColor = Color(0xFFEADDFF),)
}

@Preview
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrant()
}