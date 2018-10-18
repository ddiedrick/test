<!DOCTYPE html>
<html lang="en">
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="styles.css">
        <title>Deal Or No Deal</title>
    </head>
    <body>
        <br>
        <br>
        <br>
        <br>
        <div class="deal-container">
            <?php
            
                session_start();
                
                if(isset($_POST["accepted_amount"])){
                    echo "<h1 class='deal'>You accepted the offer! You win $".$_POST['accepted_amount']."!</h1>";
                }
                else if(isset($_SESSION["won_selected"])){
                    echo "<h1 class='deal'>You held onto your original case! You win $".number_format($_SESSION['won_selected'], 2, '.', ',')."!</h1>";
                }
                else{
                    echo "<h1 class='deal'>Error loading page</h1>";
                }
                
            ?>
        
           
            <button id="accept-btn" onclick="location.href='play.php'">Play Again?</button>
            
        </div>
    </body>

</html>