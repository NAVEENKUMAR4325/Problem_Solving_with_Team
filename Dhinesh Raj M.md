## Name: Dhinesh Raj M 
## Date: 24/3/2025

# Currency Converter Program

## Problem Description
You are given a program that converts an amount in one currency to another currency. The user can input the amount in their desired base currency (e.g., USD), and the program will convert it to a target currency (e.g., EUR) using real-time exchange rates.

The program fetches exchange rates from an API and performs the conversion.

---

## Solution Approach

### Intuition
To solve the problem:
1. **API Request:** Fetch the latest exchange rates from a reliable online API.
2. **Data Processing:** Extract the relevant exchange rate for conversion from the fetched data.
3. **Conversion Logic:** Multiply the input amount by the exchange rate to calculate the converted value.
4. **User Interaction:** Allow the user to input the source currency, target currency, and amount they wish to convert.

---

## Solution Implementation

### Python Implementation
```python
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
```
## Processing:
API Request: The program makes an HTTP request to the exchange rate API.

Exchange Rate: For example, if the exchange rate from USD to EUR is 0.85, the conversion is calculated as:

100 USD * 0.85 = 85 EUR

## Output: The program prints:

100 USD is equivalent to 85.00 EUR

## Final Output:

```
100 USD is equivalent to 85.00 EUR
```

## Complexity Analysis

### Time Complexity:

O(1) for fetching the exchange rate and performing the conversion.

The time complexity for making the API request is dependent on the network speed but is typically considered constant in most scenarios.

### Space Complexity:

O(1) since only a few variables are used to store the exchange rate and conversion result.

## Summary
This program allows users to easily convert amounts between different currencies using live exchange rates. It fetches real-time exchange data from an API and performs the necessary conversion calculation, ensuring accuracy in the results.

