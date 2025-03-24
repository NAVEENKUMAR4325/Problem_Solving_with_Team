import requests

def get_exchange_rate(from_currency, to_currency):
    """
    Fetches the exchange rate for converting from `from_currency` to `to_currency` 
    using an external API.
    """
    url = f"https://api.exchangerate-api.com/v4/latest/{from_currency}"
    response = requests.get(url)
    data = response.json()

    # Check if the target currency is available in the exchange rates
    if to_currency in data['rates']:
        return data['rates'][to_currency]
    else:
        print("Invalid currency code.")
        return None

def convert_currency(amount, from_currency, to_currency):
    """
    Converts the given amount from `from_currency` to `to_currency`.
    """
    rate = get_exchange_rate(from_currency, to_currency)
    if rate:
        converted_amount = amount * rate
        return converted_amount
    return None

def main():
    """
    Main function to interact with the user for currency conversion.
    """
    amount = float(input("Enter the amount to convert: "))
    from_currency = input("Enter the source currency (e.g., USD): ").upper()
    to_currency = input("Enter the target currency (e.g., EUR): ").upper()
    
    converted_amount = convert_currency(amount, from_currency, to_currency)
    
    if converted_amount is not None:
        print(f"{amount} {from_currency} is equivalent to {converted_amount:.2f} {to_currency}")
    else:
        print("Conversion failed due to an error.")

if __name__ == "__main__":
    main()
