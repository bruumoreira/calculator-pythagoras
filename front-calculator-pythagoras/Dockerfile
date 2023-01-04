FROM node:latest
WORKDIR /usr/local/app
COPY ./ /usr/local/app/
RUN npm install
RUN npm run build
RUN npm install -g @angular/cli

EXPOSE 80
CMD ["ng","serve", "--port", "80","--host", "0.0.0.0", "--disable-host-check"]
