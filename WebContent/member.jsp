<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<script>
function chk_frm(){
        if(!document.join.id.value){
        window.alert("아이디를 입력하세요");
        document.join.id.focus();
        return false;
        }

        if(!document.join.pw.value){
        window.alert("비밀번호를 입력하세요");
        document.join.pw.focus();
        return false;
        }

        if(!document.join.name.value){
        window.alert("이름을 입력하세요");
        document.join.name.focus();
        return false;
        }
        if(!document.join.email.value){
        window.alert("이메일을 입력하세요");
        document.join.email.focus();
        return false;
        }
        if(!document.join.phone.value){
        window.alert("휴대폰번호를 입력하세요");
        document.join.phone.focus();
        return false;
        }



        return true;
        }

</script>

<body>
	<form action="mb_ok" method="post" onsubmit="return chk_frm()" name="join">
		<svg id="ryan" viewBox="0 0 120 120"
			xmlns="http://www.w3.org/2000/svg">
            <path d="M0,150 C0,65 120,65 120,150" fill="#e0a243"
				stroke="#000" stroke-width="2.5" />
            <g class="ears">
                <path d="M46,32 L46,30 C46,16 26,16 26,30 L26,32"
				fill="#e0a243" stroke="#000" stroke-width="2.5"
				stroke-linecap="round" transform="rotate(-10,38,24)" />
                <path d="M74,32 L74,30 C74,16 94,16 94,30 L94,32"
				fill="#e0a243" stroke="#000" stroke-width="2.5"
				stroke-linecap="round" transform="rotate(10,82,24)" />
            </g>
            <circle cx="60" cy="60" r="40" fill="#e0a243" stroke="#000"
				stroke-width="2.5" />
            <g class="eyes">
                <!-- left eye and eyebrow-->
                <line x1="37" x2="50" y1="46" y2="46" stroke="#000"
				stroke-width="3" stroke-linecap="round" />
                <circle cx="44" cy="55" r="3" fill="#000" />
                <!-- right eye and eyebrow -->
                <line x1="70" x2="83" y1="46" y2="46" stroke="#000"
				stroke-width="3" stroke-linecap="round" />
                <circle cx="76" cy="55" r="3" fill="#000" />
            </g>
            <g class="muzzle">
                <path
				d="M60,66 C58.5,61 49,63 49,69 C49,75 58,77 60,71 M60,66 C61.5,61 71,63 71,69 C71,75 62,77 60,71"
				fill="#fff" />
                <path
				d="M60,66 C58.5,61 49,63 49,69 C49,75 58,77 60,71 M60,66 C61.5,61 71,63 71,69 C71,75 62,77 60,71"
				fill="#fff" stroke="#000" stroke-width="2.5" stroke-linejoin="round"
				stroke-linecap="round" />
                <polygon points="59,63.5,60,63.4,61,63.5,60,65"
				fill="#000" stroke="#000" stroke-width="5" stroke-linejoin="round" />
            </g>
            <path
				d="M40,105 C10,140 110,140 80,105 L80,105 L70,111 L60,105 L50,111 L40,105"
				fill="#fff" />
        </svg>
        <h1 align="center"> 회원가입을 하쎄용 (๑ơ ₃ ơ)♥ </h1> <br>
        
		♥아이디♥<br> <input type="text" name="id" value=""> <br>
		♥비밀번호♥<br> <input type="password" name="pw" value=""> <br>
		♥이름♥<br> <input type="text" name="name" value=""> <br>
		♥이메일♥<br> <input type="email" name="email" value=""> <br>
		♥전화번호♥<br> <input type="tel" name="phone" value=""> <br>
		<input type="submit" value="✿가입하기✿"style = "background-color:#FBEFEF">

		<script src="script.js"></script>


		

	</form>
</body>
</html>