from PIL import Image
import numpy as np

# Define the ASCII characters to represent different shades of gray
ASCII_CHARS = "@%#*+=-:. "


def scale_image(image, new_width=100):
    (original_width, original_height) = image.size
    aspect_ratio = original_height/float(original_width)
    new_height = int(aspect_ratio * new_width)
    new_image = image.resize((new_width, new_height))
    return new_image


def convert_image_to_grayscale(image):
    return image.convert("L")


def map_pixels_to_ascii(image, range_width=25):
    pixels = image.getdata()
    ascii_str = ""
    for pixel_value in pixels:
        ascii_str += ASCII_CHARS[pixel_value // range_width]
    return ascii_str


def convert_image_to_ascii(image, new_width=100):
    image = scale_image(image, new_width)
    image = convert_image_to_grayscale(image)
    ascii_str = map_pixels_to_ascii(image)
    return ascii_str


def save_ascii_to_file(ascii_str, image_path):
    # Create a text file with the same name as the image
    ascii_file_path = image_path + ".txt"
    with open(ascii_file_path, "w") as ascii_file:
        ascii_file.write(ascii_str)
    print(f"ASCII art saved to {ascii_file_path}")


def main(image_path, output_width=100):
    try:
        image = Image.open(image_path)
    except Exception as e:
        print(e)
        return

    ascii_str = convert_image_to_ascii(image, output_width)
    img_width = image.width
    for i in range(0, len(ascii_str), img_width):
        print(ascii_str[i:i+img_width])

    save_ascii_to_file(ascii_str, image_path)


if __name__ == "__main__":
    # Replace with the path to your image
    image_path = "C:\AnyConv.com__sticker.png"
    output_width = 100  # Adjust this value to control the width of the ASCII art
    main(image_path, output_width)
