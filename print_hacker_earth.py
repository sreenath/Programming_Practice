def add_to_dict(sample_dict, element):
	if element in sample_dict.keys():
		sample_dict[element] += 1
	else:
		sample_dict[element] = 1
	return sample_dict 


def temp() :
	length = raw_input("");
	text = raw_input("");
	check_dict = {}
	input_dict = {}
	check_text = "hackerearth"
	for element in check_text:
		check_dict = add_to_dict(check_dict, element)


	for element in text:
		input_dict = add_to_dict(input_dict, element)

	flag = True
	min = 0
	for element in check_dict.keys():
		if element in input_dict.keys():
			temp = input_dict[element] / check_dict[element]
			if flag:
				min = temp
				flag = False
			elif min >= temp:
				min = temp
		else:
			min = 0
			break
	return min

output = temp()
print(output);