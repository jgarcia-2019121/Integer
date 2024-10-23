import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import java.security.Key;

public class JwtUtil {

    private final String SECRET_KEY = "tu-clave-secreta-super-segura-para-firmar-el-token"; // Asegúrate de usar una clave suficientemente larga

    // Método para extraer todas las reclamaciones (claims) del token JWT
    private Claims extractAllClaims(String token) {
        Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes()); // Genera la clave usando el algoritmo HMAC SHA

        return Jwts.parserBuilder() // Usa parserBuilder() en lugar de parser()
                .setSigningKey(key) // Establece la clave secreta
                .build() // Construye el JwtParser
                .parseClaimsJws(token) // Parsea el token JWT
                .getBody(); // Obtiene las Claims (cuerpo del token)
    }
}