import java.io.File;
import java.util.regex.*;

Pattern regex = Pattern.compile(".*(\\d{2}\\/\\d{2}).*(\\d{2}\\/\\d{2}).*(\\\$(\\d*.\\d*))");

def sumBymonth = [:];
new File("~/Documents/credit-card-statement.txt").eachLine { line ->
    Matcher matcher = regex.matcher(line);    

    if (matcher.matches()) {
        def parcelas = matcher.group(2).split("/");
        def valor = matcher.group(3).replaceAll('\\$', '').replaceAll(",", ".");
        def month = 1;
        for (int i = Integer.parseInt(parcelas[0].trim()); i <= Integer.parseInt(parcelas[1].trim()); i++) {
            if (month > 12) {
                month = 1
            }
            if (sumBymonth[month] != null) sumBymonth[month] += Double.parseDouble(valor)
            if (sumBymonth[month] == null) sumBymonth[month] = Double.parseDouble(valor)

            month++
        }
    }
}
println sumBymonth;