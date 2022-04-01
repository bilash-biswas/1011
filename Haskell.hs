import Text.Printf(printf)

main :: IO ()
main = do
    let x = 3.14159
    a <- readLn
    printf "VOLUME = %.3f\n" ((4/3)*x*a*a*a :: Double)
