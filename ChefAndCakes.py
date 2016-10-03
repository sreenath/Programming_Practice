T = raw_input()
for index in range(int(T)):
	var = raw_input()
	temp = var.split()
	N = int(temp[0])
	M = int(temp[1])
	if M == 0:
		print("No 1")
	elif M == 1 or (N % 2 != 0):
		print("Yes")
	else:
		modus = N % M
		if modus == 0:
			print("No " + str(N / M))
		elif (N - M) % 2 != 0:
			print("Yes")
		else:
			result = N / modus
			print("No " + str(result))
